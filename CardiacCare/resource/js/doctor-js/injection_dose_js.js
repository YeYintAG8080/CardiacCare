$(document).ready(function () {
    var counter = 0;

    $("#addinjectionrow").on("click", function () {
        var newRow = $("<tr>");
        var cols = "";

        cols += '<td><div class="form-group"><input type="text" class="injectionInput form-control" name="injection-name' + counter + '" required="true"/></div></td>';
        cols += '<td><div class="form-group"><input type="text" class="injectionInput form-control" name="injection-level' + counter + '" required="true"/></div></td>';   
        cols += '<td><div class="form-group"><input type="time" class="injectionInput form-control" name="injection-time' + counter + '" required="true"/></div></td>';
        cols += '<td><input type="button" class="injectionDel btn btn-danger "  value="Delete"></td>';
        
        newRow.append(cols);
        $("table.injection-list").append(newRow);
        counter++;
    });



    $("table.injection-list").on("click", ".injectionDel", function (event) {
        $(this).closest("tr").remove();       
        counter -= 1
    });


});



function calculateRow(row) {
    var price = +row.find('input[name^="price"]').val();

}

function calculateGrandTotal() {
    var grandTotal = 0;
    $("table.injection-list").find('input[name^="price"]').each(function () {
        grandTotal += +$(this).val();
    });
    $("#grandtotal").text(grandTotal.toFixed(2));
}