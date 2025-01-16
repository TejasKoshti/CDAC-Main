import React from "react";
import PropTypes from "prop-types";
export default function Help({ dept, city, isMetro }) {
  return (
    <div>
      {/* <h1>
        This is Help Component for {props.dept} city is {props.city}
      </h1> */}
      {isMetro ? (
        <h1>
          This is Help Component for {dept} city is {city} , Available
        </h1>
      ) : (
        "Not AVailable"
      )}
    </div>
  );
}
Help.propTypes = {
  dept: PropTypes.string,
  isMetro: PropTypes.bool,
  city: PropTypes.string.isRequired,
};
Help.defaultProps = {
  dept: "Sales",
};
