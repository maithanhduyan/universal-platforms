/**
 * MAIN SCRIPT
 * 
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 */

(function ($) {
    "use strict";

    // Add active state to nav links
    // because the 'href' property of the DOM element is the absolute path
    var path = window.location.href;
    $(".nav-sidebar li.nav-item a.nav-link").each(
            function () {
                if (this.href === path) {
                    $(this).parent().parent().parent().addClass("menu-open");
                    $(this).parent().parent().parent().find('.nav-link')
                            .first().addClass("active");
                    $(this).addClass("active");
                    return false;
                }
            });

    // Back to top button
    $(window).scroll(function () {
        if ($(this).scrollTop() > 100) {
            $('.back-to-top').fadeIn('slow');
        } else {
            $('.back-to-top').fadeOut('slow');
        }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({
            scrollTop : 0
        }, 1500, 'easeInOutExpo');
        return false;
    });

    // Initi AOS
    AOS.init({
        duration : 800,
        easing : "ease-in-out"
    });

})(jQuery);

/**
 * WEBSOCKET-CLIENT
 */

'use strict';
var stompClient = null;
var username = null;

function connect() {
    username = 'admin@pos.com'
    var socket = new SockJS('/ws');
    console.log('Connnecting...');
    stompClient = Stomp.over(socket);

    stompClient.connect({}, onConnected, onError);
}

// Connect to WebSocket Server.
connect();

function onConnected() {
    // Subscribe to the Public Topic
    stompClient.subscribe('/topic/publicChatRoom', onMessageReceived);

    // Tell your username to the server
    stompClient.send("/app/chat.addUser", {}, JSON.stringify({
        sender : username,
        type : 'JOIN'
    }))

}

function onError(error) {
    console.log('Could not connect to WebSocket server. Please refresh this page to try again!');
}

function sendMessage(input) {
    var messageContent = input;
    if(messageContent && stompClient) {
        var chatMessage = {
            sender: username,
            content: messageContent,
            type: 'CHAT'
        };
        console.log('sending...');
        stompClient.send("/app/chat.sendMessage", {}, JSON.stringify(chatMessage));
        //messageInput.value = '';
    }
    //event.preventDefault();
}

function onMessageReceived(payload) {
    var message = JSON.parse(payload.body);
    console.log(message.sender + ": " + message.content);
}

// messageForm.addEventListener('submit', sendMessage, true);
