// EVENT DELEGATION //
$(document).ready(function() {
    $('#example').on('click', 'button', function() {
        var selected = $('#place option:selected');
        var value = selected.val();
        var price = selected.data('price');

        if (price) {
            $('#result').html(value + " " + price);
        }
    })
})

// CHANGE EVENTS //
$(document).ready(function() {
    $('#example').on('change', 'select', function() {
        var selected = $(this).find('option:selected');
        var value = selected.val();
        var price = selected.data('price');

        if (price) {
            $('#result').html(value + " " + price);
        }
    })
})


// KEYBOARD EVENTS //
$(document).ready(function() {
    $('#example').on('keyup', 'input', function() {
        $('#result').html('Your name is: ' + $(this).val());
    })
})