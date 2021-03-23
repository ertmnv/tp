import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./containers/App";
import reportWebVitals from "./reportWebVitals";
import { UserSignupPage } from "./pages/UserSignupPage";
import { LoginPage } from "./pages/LoginPage";
import * as apiCalls from "./api/apiCalls";
import { HashRouter } from "react-router-dom";
import { Provider } from "react-redux";
import configureStore from "./redux/configureStore";
//import { createStore, applyMiddleware } from "redux";
//import authReducer from "./redux/authReducer";
//import logger from "redux-logger";
//import thunk from "redux-thunk";

//const store = createStore(authReducer, applyMiddleware(thunk, logger));
const store = configureStore();

ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
      <HashRouter>
        <App />
      </HashRouter>
    </Provider>
  </React.StrictMode>,
  document.getElementById("root")
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
