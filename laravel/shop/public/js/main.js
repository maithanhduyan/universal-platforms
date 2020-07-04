!(function ($) {
    "use strict";

    //Navbar Toggle Button Click
    $('.navbar-toggler').on('click', function () {
        // Change icon
        $(this).children('.fa-bars, .fa-times').toggleClass("fas fa-bars fas fa-times");
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