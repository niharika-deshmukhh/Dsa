/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
 
var chunk = function(arr, size) {
    let result=[];
    for(let i=0;i<arr.length;i=i+size){
      let x=arr.slice(i,i+size);
      result.push(x);
    }
    return result;
    
};
