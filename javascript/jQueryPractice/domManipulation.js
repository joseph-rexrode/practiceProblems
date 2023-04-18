// append() and prepend()
// happens WITHIN the container specified

$(document).ready(function() {
    $('#add-container').on('click', 'button', function() {
        var value = $('#add-container input').val();
        var html = 'insert html code here';

        $('#places-container').append(html);
        // OR //
        $(html).appendTo('#places-container');

        // OR IF YOU WANT TO ADD TO BEGINNING //
        $('#places-container').prepend(html);
    })
})


// before() and after()
// happens ON SAME LEVEL as container specified
$(document).ready(function() {
    $('#add-container').on('click', 'button', function() {
        var value = $('#add-container input').val();
        var html = 'insert html code here';

        $('#places-container').children().last().after(html);
        // OR //
        $('#places-container').children().first().before(html);
    })
})


// remove elements
$(document).ready(function() {
    // this doesn't work for new elements
    $('#places-container .remove').on('click', function() {
        $(this).parent().remove()
    })

    // this works with new elements added!
    // because #places container was there from the beginning and it is the one being selected initially
    $('#places-container').on('click', '.remove', function() {
        $(this).parent().remove()
    })
})


// empty html content of an element

$(document).ready(function() {
    $('#container').html("Hello world");

    $('#container').empty();

    // read / write specific attributes

    $('#container').attr('new-attribute', 123);
    console.log($('#container').attr('new-attribute'));
})