import React from "react";
import defaultPicture from "../assets/profile.png";
import ProfileImageWithDefault from "./ProfileImageWithDefault";

const ProfileCard = (props) => {
  const { displayname, username, image } = props.user;

  return (
    <div className="card">
      <div className="card-header text-center">
        <ProfileImageWithDefault
          className="rounded-circle shadow"
          alt="profile"
          width="200"
          height="200"
          image={image}
        />
      </div>
      <div className="card-body text-center">
        <h4>{`${displayname}@${username}`}</h4>
      </div>
    </div>
  );
};

export default ProfileCard;
