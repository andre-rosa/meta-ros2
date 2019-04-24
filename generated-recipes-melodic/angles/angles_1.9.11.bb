# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of simple math utilities to work         with angles. The utilities cover simple things like         normalizing an angle and conversion between degrees and         radians. But even if you're trying to calculate things like         the shortest angular distance between two joinst space         positions of your robot, but the joint motion is constrained         by joint limits, this package is what you need. The code in         this packge is stable and well tested. There are no plans for         major changes in the near future."
AUTHOR = "Ioan Sucan <isucan@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/angles"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/geometry_angles_utils-release/archive/release/melodic/angles/1.9.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "30a58b5ff75af8d362fa36f3a023228e"
SRC_URI[sha256sum] = "e234fbb316d2e74febab2c47710ecb9c1c7231c439d68a2f8540b416245b2b9a"
S = "${WORKDIR}/geometry_angles_utils-release-release-melodic-angles-1.9.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/angles/angles_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/angles/angles_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/angles/angles-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/angles/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/angles/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
