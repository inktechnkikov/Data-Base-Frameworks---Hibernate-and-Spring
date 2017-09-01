/**
 * Created by inktech.n.kikov on 29-Jun-16.
 */
function login() {
   let userData={
       username: $("#logUser").val(),
       password: $("#userPass").val(),
    };
    let baseUrl = "https://baas.kinvey.com/";
    let appKey = "kid_S1UeJN-U";
    let appSecret = "07ae69915c884c87947486496f4e6345";

    let headers = {};
    headers['Authorization'] = "Basic " + btoa(appKey + ":" + appSecret);
    headers['Content-Type'] = "application/json";
    let method = "POST";
    let requestURL = baseUrl + "user/" + appKey + "/login";
    let request = {
        method:method,
        url:requestURL,
        headers:headers,
        userData:JSON.stringify(userData)
    }
    $.ajax(request).then(function (response) {
        let userAuth = response.kmd.authtoken;
        console.log(userAuth);
    })
}