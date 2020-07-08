$(document).ready(function () {
    var counter = 0;

    $("#addmedicinerow").on("click", function () {
        var newRow = $("<tr>");
        var cols = "";

        cols += '<td><div class="form-group"><input type="text" class="medicineInput form-control" name="medicine-name' + counter + '" required="true"/></div></td>';         
        cols += '<td><div class="form-check-inline"><label class="form-check-label"><input type = "checkbox" name = "medication-time' + counter + '" value = "Morning"  >Morning</label></div><div class="form-check-inline"><label class="form-check-label"><input type = "checkbox" name = "medication-time' + counter + '" value = "Afternoon"  >Afternoon</label></div><div class="form-check-inline"><label class="form-check-label"><input type = "checkbox" name = "medication-time' + counter + '" value = "Evening">Evening</label></div></td>';  
        cols += '<td><input type="button" class="medicineDel btn btn-danger "  value="Delete"></td>';
        newRow.append(cols);
        $("table.medicine-list").append(newRow);
        counter++;
    });



    $("table.medicine-list").on("click", ".medicineDel", function (event) {
        $(this).closest("tr").remove();       
        counter -= 1
    });


});



function calculateRow(row) {
    var price = +row.find('input[name^="price"]').val();

}

function calculateGrandTotal() {
    var grandTotal = 0;
    $("table.medicine-list").find('input[name^="price"]').each(function () {
        grandTotal += +$(this).val();
    });
    $("#grandtotal").text(grandTotal.toFixed(2));
}