# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This app utilises pano_ros for taking snapshots and stitching them together to create panorama pictures."
AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_panorama"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    turtlebot3-applications-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    turtlebot3-applications-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    turtlebot3-applications-msgs \
    turtlebot3-bringup \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_panorama/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "65065f333dfe8698b24670bef2ee5d03"
SRC_URI[sha256sum] = "1ea012a9fb7e79c68cb54f5e608739f79f378ab6867bad8d1aeee3d7e5039c3e"
S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_panorama-1.1.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/turtlebot3-applications/turtlebot3-applications_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/turtlebot3-applications/turtlebot3-applications_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-applications/turtlebot3-applications-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-applications/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-applications/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
