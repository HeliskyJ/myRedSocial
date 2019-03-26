/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('#agg').click(function() {
	    a = ($('#in').val());
	    
$('.in').append( "<div class='hola'>" + a + "<button class='adios'>" + 'x' + "</button>" + "</div>");
});

$(document).on('click','.adios', function(){
     $(this).parent().remove();

});