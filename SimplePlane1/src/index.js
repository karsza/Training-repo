import style from "./css/index.scss";
$('.openmodale').click(function(e) {
    e.preventDefault();
    $('.modale').addClass('opened');
});
$('.closemodale').click(function(e) {
    e.preventDefault();
    $('.modale').removeClass('opened');
});

