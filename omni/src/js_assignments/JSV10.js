/* 
    Napisati program koji dobije početnu poziciju (kao x i y) i orijentaciju (N, S, W, E) Lengtonovog mrava https://en.wikipedia.org/wiki/Langton%27s_ant (videti i na slajdovima) i broj generacija i vrati poziciju i orijentaciju mrava posle toliko generacija. 

    Pravila Lengtonovog mrava (za nas):
    1. Svet je beskonačna 2D ravan podeljena na kvadrate jednake veličine koji mogu biti beli ili crni. 
    2. Negde u svetu je mrav. Mrav ima poziciju i rotaciju. 
    3. U svakom potezu (ili generaciji) mrav prati sledeća pravila:
        a. Ako stoji na polju koje je belo, mrav se okrene za 90 stepeni u smeru kazaljke na satu, promeni boju ispod sebe iz bele u crnu i pomeri se napred za jedan korak. 
        b. Ako stoji na polju koje je crno, mrav se okrene za 90 stepeni u smeru suprotnom od kazaljke na satu, promeni boju ispod sebe iz crne u belu i pomeri se napred za jedan korak.
    4. Na početku igre, ceo svet je crn. 

    Lengtonov mrav je primer teoretske tvorevine poznate kao 'ćelijski automat' i ima kolosalan značaj u teoretskim računarskim naukama. Za nas je to odlična vežba veštine programiranja. 
*/

const cw_turn = (o) => {
  if(o == "N"){
      return "E";
  }else if(o == "E"){
      return "S";
  }else if(o == "S"){
      return "W";
  }else if(o == "W"){
      return "N";
  }
}

const ccw_turn = (o) => {
  if(o == "N"){
      return "W";
  }else if(o == "E"){
      return "N";
  }else if(o == "S"){
      return "E";
  }else if(o == "W"){
      return "S";
  }
}

const move_ahead = (pos, o) => {
  if(o == "N"){
      return {x: pos.x, y: pos.y + 1};
  }else if(o == "E"){
      return {x: pos.x + 1, y: pos.y};
  }else if(o == "S"){
      return {x: pos.x, y: pos.y - 1};
  }else if(o == "W"){
      return {x: pos.x - 1, y: pos.y};
  }
}

const mrav = (pos, o, g) => {
  let tabla = new Set();//Nema u set-u znači crno, ima, znači belo. 
  for(let i = 0; i < g; i++){
      if(tabla.has(`${pos.x},${pos.y}`)){
          //belo
          o = cw_turn(o);
          tabla.delete(`${pos.x},${pos.y}`);
          pos = move_ahead(pos, o);
      }else{
          //crno
          o = ccw_turn(o);
          tabla.add(`${pos.x},${pos.y}`);
          pos = move_ahead(pos, o);
      }
  }
  return {
      pos: pos,
      orientation: o
  };

}

const JSV10 = () => {
  let m = mrav({x: 0, y: 0}, "N", 4000);
  return <div>
      <pre>
          {JSON.stringify(m)}
      </pre>
  </div>;
};

export default JSV10;
