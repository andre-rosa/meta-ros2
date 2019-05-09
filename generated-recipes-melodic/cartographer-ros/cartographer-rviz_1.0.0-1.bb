# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations. This package provides Cartographer's RViz integration."
AUTHOR = "The Cartographer Authors <cartographer-owners@googlegroups.com>"
ROS_AUTHOR = "The Cartographer Authors <google-cartographer@googlegroups.com>"
HOMEPAGE = "https://github.com/googlecartographer/cartographer_ros"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_CN = "cartographer_ros"
ROS_BPN = "cartographer_rviz"

ROS_BUILD_DEPENDS = " \
    cartographer \
    cartographer-ros \
    cartographer-ros-msgs \
    eigen-conversions \
    message-runtime \
    qtbase \
    roscpp \
    roslib \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cartographer \
    cartographer-ros \
    cartographer-ros-msgs \
    eigen-conversions \
    message-runtime \
    qtbase \
    roscpp \
    roslib \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cartographer \
    cartographer-ros \
    cartographer-ros-msgs \
    eigen-conversions \
    message-runtime \
    qtbase \
    roscpp \
    roslib \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/cartographer_ros-release/archive/release/melodic/cartographer_rviz/1.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2453f413fbf7ee88ae808767c8f18d44"
SRC_URI[sha256sum] = "4eeb8e97c9723d89c14718afc7d81ce1a0a47d41cd5e1d73a8144865840dc523"
S = "${WORKDIR}/cartographer_ros-release-release-melodic-cartographer_rviz-1.0.0-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('cartographer-ros', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('cartographer-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/cartographer-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/cartographer-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
