$('.btn-addtocart').on('click',function(e){
    if(!$('#user-status').data('islogged')){
        e.preventDefault();
        alert("Najpierw się zaloguj");
    }
    let bookid=$(this).data('bookid');
    $('#bookid').val(bookid);
});