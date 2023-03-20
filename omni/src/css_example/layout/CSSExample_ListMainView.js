
import './css_example_listmainview.css';
const CSSExample_ListMainView = () => {

   const openNav = () => {
        document.getElementById("sidebar").style.width = "250px";
        // document.getElementById("main").style.marginLeft = "250px";

    }
    const closeNav = () => {
        document.getElementById("sidebar").style.width = "0";
        // document.getElementById("main").style.marginLeft = "0";

    }
    return <div id='main'> 
        <div className='header_list_view'>
            <div>
               <span onClick={openNav}> &#9776; Open </span>
            </div>
            <input type='text' placeholder='Search'/>
        </div>
        <div className='left_side_bar_container' id='sidebar'>            
                {/* side bar koji ce se prikazati sa strane */}
                <a href="javascript:void(0)" class="closebtn" onClick={closeNav}>&times;</a>
                <a href="#">About</a>
                <a href="#">Services</a>
                <a href="#">Clients</a>
                <a href="#">Contact</a>          
        </div>
        <div className="list_view">

        </div>
    </div>
}

export default CSSExample_ListMainView;