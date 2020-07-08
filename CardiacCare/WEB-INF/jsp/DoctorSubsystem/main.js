jQuery(window).on('load', function() {
    jQuery("#preloader").delay(2000).fadeOut("normal");
});


$(document).ready(function(){
	$(".toggle").click(function(){
		$(".nav").slideToggle('normal');
	});
});