$(document).ready(() => {
    $("#submit").click(() => {
        let nomeUsuario = $("#nome").val();
        let enderecoUsuario = $("#endereco").val();
        if (nomeUsuario === "" || enderecoUsuario === "") {
            alert("vazio");
        } else {
            let data = JSON.stringify({nome: nomeUsuario, endereco: enderecoUsuario});
            //
            //PUT,DELETE,POST
            //
            $.ajax({
                url: "api",
                contentType: "application/json",
                type: "delete",
                data: data,
                dataType: "json",
                success: (data) => {
                    console.log(data);
                    $("#res").html(data.nome + " " + data.endereco);
                },
                error: (e) => {
                    alert("Error");
                }
            });
            //
            //GET
            //
            /*$.ajax({
             url: "api?nome=" + "Abner",
             type: "get",
             success: (data) => {
             let lista = [];
             lista = JSON.parse(data);
             console.log(lista);
             },
             error: (data) => {
             alert("error");
             }
             });*/
            //
            let myHeaders = new Headers();
            myHeaders.append("Content-Type", "application/json");
            let url = "api";
            //
            //metodo POST,PUT,DELETE
            //
            let options = {
                method: 'delete',
                body: data,
                headers: myHeaders,
                mode: 'cors',
                cache: 'default'
            };
            //metodo GET
            /*let options = {                
             headers: myHeaders,
             method: 'get',
             mode: 'cors',
             cache: 'default'
             };*/
            //fetch pelo GET
            /*fetch(url, options)
             .then((res) => res.json())
             .then((data) => {
             let l = [];
             l = data;
             console.log(l[0]);
             })
             .catch((e) => console.log(e));*/
            //fetch pelo POST,PUT,DELETE
            /*fetch(url, options)
             .then((res) => res.json())
             .then((data) => {     
             console.log(data);
             })
             .catch((e) => console.log(e));*/
        }
    });
});


