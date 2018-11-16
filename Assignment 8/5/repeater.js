document.addEventListener('DOMContentLoaded', ready);

function ready() {
    let input_one = document.getElementById("input_one"); //getting the element based on its id
    let input_two = document.getElementById("input_two");
    input_one.addEventListener("input", changeHandler); //given input function and name of function
    input_two.addEventListener("input", altHandler);
    function changeHandler(event){ // given tasks to each functions.
        input_two.value = input_one.value;
    }
    function altHandler(event){
        input_one.value = input_two.value;
    }
}