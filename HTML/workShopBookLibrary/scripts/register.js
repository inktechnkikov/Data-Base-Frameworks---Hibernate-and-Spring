function register() {
    let username = $('#username').val();
    let password = $('#pass').val();

    let data = {
        inputUsername:username,
        inputPassword:password
    };
    let baseUrl = "https://baas.kinvey.com/";
    let appKey = "kid_S1UeJN-U";
    let appSecret = "07ae69915c884c87947486496f4e6345";

    let method = "POST";
    let requestUrl = baseUrl + "user/" + appKey + "/";
    let headers = {};
       headers['Authorization']="Basic " + btoa(appKey + ":" + appSecret);
        headers['Content-Type'] = "application/json";

        let request = {
        url:requestUrl,
        method:method,
        headers:headers,
        data:JSON.stringify(data)
    };
    $.ajax(request);
}



