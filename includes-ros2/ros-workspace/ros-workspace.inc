# Copyright (c) 2019 LG Electronics, Inc.


# ASSERT(<prefix> == /usr)
# ros-workspace installs its setup scripts under <prefix>, which is an unnatural location when <prefix> is /usr. Move them to be
# under <sysconfdir>/profile.d/ros and create "ros_" prefixed symlinks to them under <bindir>. If "ros-workspace-implicit"
# appears in IMAGE_FEATURES, create a ros.sh that sources ros/setup.sh, thereby setting up the ROS workspace for every login shell.
do_install_append() {
    profile_dir=${sysconfdir}/profile.d/ros
    mkdir -p ${D}$profile_dir
    cd ${D}$profile_dir

    mv ${D}${prefix}/*setup.bash .
    mv ${D}${prefix}/*setup.zsh .
    mv ${D}${prefix}/*setup.sh .
    mv ${D}${prefix}/_order_packages.py .

    for f in *setup.bash *setup.zsh; do
        # Hardcode AMENT_CURRENT_PREFIX and the directory where these files reside.
        sed -i -e '/AMENT_CURRENT_PREFIX=/ s@=.*@=${prefix}@' \
               -e '/\$AMENT_CURRENT_PREFIX/ s@\$AMENT_CURRENT_PREFIX@'$profile_dir'@' $f
    done

    # Hardcode the directory where _order_packages.py resides.
    sed -i -e '/_order_packages\.py/ s@\$AMENT_CURRENT_PREFIX/@'$profile_dir'/@' local_setup.sh

    mkdir -p ${D}${bindir}
    for f in *setup.bash *setup.zsh *setup.sh; do
        ln -s $profile_dir/$f ${D}${bindir}/ros_$f
    done

    if ${@bb.utils.contains('IMAGE_FEATURES', 'ros-workspace-implicit', 'true', 'false', d)}; then
        echo ". $profile_dir/setup.sh" > ../ros.sh
    fi

    cd - > /dev/null
}
