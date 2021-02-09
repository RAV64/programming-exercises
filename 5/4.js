function piprand(){
    var count = 0;
    var pips1 = 0;
    var pips2 = 1;
    while (pips1 != pips2){
        pips1 = Math.round((Math.random() * 5) + 1);
        pips2 = Math.round((Math.random() * 5) + 1);
        count++;
    };
    console.log(`Same dice pips: ${pips1} and ${pips2}`);
    console.log(`There were ${count} randomization rounds until we got the same pips.`);
};