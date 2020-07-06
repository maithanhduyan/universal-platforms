/**
 * MAIN SCRIPT
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 */

(function ($) {
    "use strict";

    // Add active state to nav links
    // because the 'href' property of the DOM element is the absolute path
    var path = window.location.href;
    $(".nav-sidebar li.nav-item a.nav-link").each(function () {
        if (this.href === path) {
            $(this).parent().parent().parent().addClass("menu-open");
            $(this).parent().parent().parent().find('.nav-link').first().addClass("active");
            $(this).addClass("active");
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
            scrollTop: 0
        }, 1500, 'easeInOutExpo');
        return false;
    });

    // Initi AOS
    AOS.init({
        duration: 800,
        easing: "ease-in-out"
    });

})(jQuery);
