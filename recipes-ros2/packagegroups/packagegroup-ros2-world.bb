DESCRIPTION = "ros2-world package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    packagegroup-ros2-demos \
    rosidl-generator-py \
    ros2cli \
    ros2launch \
    ros2msg \
    ros2node \
    ros2pkg \
    ros2run \
    ros2service \
    ros2srv \
    ros2topic \
    actionlib-msgs \
    diagnostic-msgs \
    launch \
    launch-ros \
    nav-msgs \
    std-srvs \
    stereo-msgs \
    trajectory-msgs \
    visualization-msgs \
"
