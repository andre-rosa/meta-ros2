# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The URDF file for a quadrotor to be used with the xpp packages and a      simple rviz publisher of quadrotor tfs.           Adapted from Daniel Mellinger, Nathan Michael, Vijay Kumar,      &quot;Trajectory Generation and Control for Precise Aggressive Maneuvers     with Quadrotors&quot;."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
HOMEPAGE = "http://github.com/leggedrobotics/xpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    roscpp \
    xacro \
    xpp-vis \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    xacro \
    xpp-vis \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    xacro \
    xpp-vis \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_quadrotor/1.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7af353198cc7820d77a81093fee36cde"
SRC_URI[sha256sum] = "8a3c7cbaa6def3250bf3825790f587b3626799b51dc7105917c20af6b8f5d3b4"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_quadrotor-1.0.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/xpp/xpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/xpp/xpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/xpp/xpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/xpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/xpp/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
