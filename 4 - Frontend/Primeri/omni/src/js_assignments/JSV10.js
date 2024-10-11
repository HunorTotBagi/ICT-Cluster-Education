import React from "react";
import { useNavigate } from "react-router-dom";

const JSV10 = (props) => {
  const { loggedIn, email, setLoggedIn } = props;  // Add setLoggedIn to manage login state
  const navigate = useNavigate();

  const onButtonClick = () => {
    if (loggedIn) {
      setLoggedIn(false);  // Log out user
      navigate("/login");  // Redirect to login page
    } else {
      setLoggedIn(true);   // Log in user
      navigate("/");       // Redirect to home page or wherever you want after login
    }
  };

  return (
    <div className="mainContainer">
      <div className="titleContainer">
        <div>Welcome!</div>
      </div>
      <div>This is the home page.</div>
      <div className="buttonContainer">
        <input
          className="inputButton"
          type="button"
          onClick={onButtonClick}
          value={loggedIn ? "Log out" : "Log in"}
        />
        {loggedIn ? <div>Your email address is {email}</div> : <div />}
      </div>
    </div>
  );
};

export default JSV10;


