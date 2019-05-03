# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The rotors_gazebo_plugins package"
AUTHOR = "Fadri Furrer <fadri.furrer@mavt.ethz.ch>"
HOMEPAGE = "https://github.com/ethz-asl/rotors_simulator"
SECTION = "devel"
LICENSE = "ASL 2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_BPN = "rotors_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    gazebo \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    glog \
    mav-msgs \
    mavros \
    octomap \
    octomap-msgs \
    octomap-ros \
    protobuf \
    rosbag \
    roscpp \
    rotors-comm \
    rotors-control \
    std-srvs \
    tf \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    gazebo \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    glog \
    mav-msgs \
    mavros \
    octomap \
    octomap-msgs \
    octomap-ros \
    protobuf \
    rosbag \
    roscpp \
    rotors-comm \
    rotors-control \
    std-srvs \
    tf \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    gazebo \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    glog \
    mav-msgs \
    mavros \
    octomap \
    octomap-msgs \
    octomap-ros \
    protobuf \
    rosbag \
    roscpp \
    rotors-comm \
    rotors-control \
    std-srvs \
    tf \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_gazebo_plugins/2.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2d0ac96c44284c712167279449aef761"
SRC_URI[sha256sum] = "9a4fc0b6f45d9fe43292fa7b4656ea3190c32928c36b33aee9adfaa0c3fafcd2"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_gazebo_plugins-2.2.3-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rotors-simulator', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/rotors-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/rotors-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
