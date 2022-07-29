function commentSave(){
        var dto = {
            name : "osh",
            comment : "comment"
        };
        console.log(JSON.stringify(dto));
        alert(JSON.stringify(dto));

        $.ajax({
            type: "POST",
            url: "/sendData",
            data: { name : "osh", comment : "comment" }
        });
}


