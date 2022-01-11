
let add =document.getElementById("add");

let Eid =document.querySelector(".Eid");
let name =document.querySelector(".name");
let salary =document.querySelector(".salary");

let idmsg=document.getElementById("idmsg");
let namemsg=document.getElementById("namemsg");
let salarymsg=document.getElementById("salarymsg");

let formid=document.getElementById("formid");

let dept=document.getElementById("dept");
let skill =document.getElementById("skill");



add.addEventListener("click",(event)=>{
    if(Eid.value=="" ||Eid.value==undefined){
        event.preventDefault();
        idmsg.textContent="*Id is required";
    }
    if(name.value=="" ||name.value==undefined){
        event.preventDefault();
        namemsg.textContent="*Name is required";
    }
    if(salary.value=="" ||salary.value==undefined){
        event.preventDefault();
        salarymsg.textContent="*Enter valid salary";
    }
    if(Eid.value!=undefined && Eid.value!="" && name.value!="" && name.value!=undefined && salary.value!="" && salary.value!=undefined){
        event.preventDefault();
        let employee_object={
            Eid:Eid.value,
            name:name.value,
            salary:salary.value,
            department:dept.value,
            skill:skill.value
        }
        console.log(employee_object);
        localStorage.setItem(`${Eid.value}`,JSON.stringify(employee_object));
        document.getElementById("msg-status").textContent="Details are saved";
        document.getElementById("msg-status").style.color="green";
    }
})

let  keys = Object.keys(localStorage);

for (let id of keys){
    console.log(id)
    let stringified_object=localStorage.getItem(id);
    let parsed_object=JSON.parse(stringified_object);
    console.log(parsed_object);
} 