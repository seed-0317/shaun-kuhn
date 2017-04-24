var homework = {};
module.exports = homework;

/*
  1. Return the nth fibonacci number

  f(0) = 0
  f(1) = 1
  f(10) = 55
*/
homework.fibonacci = function(n){

        var x = 0;
        var y = 1;

        if (n === 0) {
            y = 0;
        }

        for (var i = 1; i <= n; i++) {

            if (i % 2 === 0) {
                x = x + y;
            }
            else y = x + y;
        }

        return Math.max(x,y);

    };

/*
  2. Sort array of integers

  f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

  Don't use the Array sort() method... that would be lame.
*/
homework.sort = function(array) {

        if (array.length < 2) {
            return array;
        }

        var arr;
        var p0 = array;
        for(var i = 0; i < array.length; i++) {
            for(var h=i+1; h<array.length; h++) {

                if (p0[i] > array[h]) {
                    arr = p0[i];
                    p0[i] = array[h];
                    array[h] = arr;
                }
            }
        }
        return p0;

    };

/*
  3. Return the factorial of n

  f(0) = 1
  f(1) = 1
  f(3) = 6
*/
homework.factorial = function(n){

    if (n < 2) {
        return n;
    }else

        var k = n-1;
    return n*homework.factorial(k);
};


/*
  4. Rotate left

  Given array, rotate left n times and return array

  f([1,2,3,4,5], 1) = [2,3,4,5,1]
  f([1,2,3,4,5], 6) = [2,3,4,5,1]
  f([1,2,3,4,5], 3) = [4,5,1,2,3]

*/
homework.rotateLeft = function(array, n) {


    var newOne = array.slice();
    var len = array.length;


    if (n > len) {
        n= n-len;
    }
    var cnt = 0;
    for (var i=0; i < len; i++) {

        if (i < len - n) {
            newOne[i] = array[i+n];
        }
        else {
            newOne[i] = array[cnt];
            cnt = cnt + 1;
        }
    }
    return newOne;
};


/*
  5. Balanced Brackets

  A bracket is any one of the following: (, ), {, }, [, or ]

  The following are balanced brackets:
    ()
    ()()
    (())
    ({[]})

  The following are NOT balanced brackets:
  (
  )
  (()
  ([)]

  Return true if balanced
  Return false if not balanced
*/
homework.balancedBrackets = function(bracketsString){

    var sL = BS.length;
    var sum = 0;
    var torf = false;
    if (sL < 2 || sL % 2 != 0) {
        return false;
    }
    else {

        var x = BS.charAt(0);
        var y = BS.charAt(sL-1);

        if ((x == '(' && y == ')') || (x == '[' && y == ']') || (x == '{' && y == '}')) {
            torf = true;
        }
    }

    return torf;
    
};
