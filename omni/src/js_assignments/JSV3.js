/* 
    Zadatak 3
    Iskoristiti funkciju iz Zadatka 2 da se sortira sledeća lista podataka
    let studenti = [
        {indeks: "XY 409/2072", ime: "Alice", prezime: "Alferson"},
        {indeks: "ZW 133/2072", ime: "Bob", prezime: "Bobbert"},
        {indeks: "XY 112/2073", ime: "Carol", prezime: "Creed"},
        {indeks: "XY 507/2071", ime: "Drew", prezime: "Danger"},
        {indeks: "ZW 233/2070", ime: "Eve", prezime: "Emmerson"},
        {indeks: "ZW 57/2072", ime: "Trent", prezime: "Tweed"},
        {indeks: "XY 111/2071", ime: "Fred", prezime: "Franks"},
        {indeks: "ZW 404/2073", ime: "George", prezime: "Green"}
    ];
    I to po indeksu tako što se prvo sortira abecedno po smeru, pa zatim po godini, i konačno po broju indeksa. Da bi se sortiralo abecedno samo treba porediti stringove kao da su brojevi. 
*/

const sortiranje = () => {
  let studenti = [
    {indeks: "XY 409/2072", ime: "Alice", prezime: "Alferson"},
    {indeks: "ZW 133/2072", ime: "Bob", prezime: "Bobbert"},
    {indeks: "XY 112/2073", ime: "Carol", prezime: "Creed"},
    {indeks: "XY 507/2071", ime: "Drew", prezime: "Danger"},
    {indeks: "ZW 233/2070", ime: "Eve", prezime: "Emmerson"},
    {indeks: "ZW 57/2072", ime: "Trent", prezime: "Tweed"},
    {indeks: "XY 111/2071", ime: "Fred", prezime: "Franks"},
    {indeks: "ZW 404/2073", ime: "George", prezime: "Green"}
];
  const re = /([A-Z]{2}) (\d+)\/(\d{4})/;

  for(let i=0; i<studenti.length; i++){
    for(let j=i+1;j<studenti.length;j++){

      let [, si_smer, si_broj, si_godine] = studenti[i].indeks.match(re);
      let [, sj_smer, sj_broj, sj_godine] = studenti[j].indeks.match(re);
      si_broj = parseInt(si_broj);
      sj_broj = parseInt(sj_broj);
      si_godine = parseInt(si_godine);
      sj_godine = parseInt(sj_godine);

      if(si_smer > sj_smer){
        let temp = studenti[i];
        studenti[i] = studenti[j];
        studenti[j] = temp
      }else if(si_smer === sj_smer){
        if(si_godine>sj_godine){
          let temp = studenti[i];
          studenti[i] = studenti[j];
          studenti[j] = temp
        }else if(si_godine === sj_godine){
          if(si_broj>sj_broj){
            let temp = studenti[i];
            studenti[i] = studenti[j];
            studenti[j] = temp
        }
      }
    }
  }

}
 
  console.log(studenti)
}
const JSV3 = () => {
  return <pre>{sortiranje()}</pre>;
};

export default JSV3;
