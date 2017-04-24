/**
 * Created by vso513 on 4/19/17.
 */

console.log("does this show");

function add (b,c) {
    this.b = b;
    this.c = c;
    function d() {
        return b+c;
    }
}

console.log (add(3,4));
console.log (add(3)(4));