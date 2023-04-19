// showing and hiding elements

$(document).ready(function() {
    $('.item-box').on('click', 'a.info-link', function(event) {
        event.preventDefault();

        // hide(), show(), toggle()
        $(this).closest('.item-box').find('.more-info').toggle('slow', function() {
            alert('finished');
        })
    })
});


// fade effect

$(document).ready(function() {
    $('.item-box').on('click', 'a.info-link', function(event) {
        event.preventDefault();

        // fadeIn(), fadeOut(), fadeToggle() - makes content inside item-box fade, not box itself
        $(this).closest('.item-box').find('more-info').fadeToggle();
    })
});


// slide effect 

$(document).ready(function() {
    $('.item-box').on('click', '.info-link', function(event) {
        event.preventDefault();

        // slideDown(), slideUp(), slideToggle()
        $(this).closest('.item-box').find('more-info').slideToggle('fast');
    })
});


// animations for CSS properties

    // animate method can ONLY change numerical properties, so no color

$(document).ready(function() {
    $('#example1').on('click', function() {
        $(this).animate({
            opacity: '-=0.3' // decreases by a set amount each time
            }, 500, function() {
            alert('completed!');
        })
    })

    $('#example2').on('click', function() {
        $(this).animate({
            left: 200,
            width: 40
        }, 500)
    })

    $('#example3').on('click', function() {
        $(this).animate({
            left: '+=20',
            width: '+=50'
        }, 500)
    })
});

