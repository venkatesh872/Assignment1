let removestatus=document.getElementById("removestatus");
      let removeEmp=document.getElementById("removeEmp");
      let idfrominput=document.getElementById("idfrominput");
      
      removeEmp.onclick=function(){
          let  keys = Object.keys(localStorage);
      
          for (let id of keys){
              if(idfrominput.value===id){
                  localStorage.removeItem(id);
                  removestatus.textContent="Employee is deleted successfully";
                  removestatus.style.color="green";
              }
          }
      }