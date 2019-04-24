# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The iirob_filters package implements following filters:       1) Low-Pass       2) Moving Mean       3) Gravity Compensation (used for force-torque sensors)       4) Threshold Filter       5) Kalman Filter"
AUTHOR = "Denis Štogl <denis.stogl@kit.edu>"
HOMEPAGE = "http://wiki.ros.org/iirob_filters"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    eigen-conversions \
    filters \
    geometry-msgs \
    pluginlib \
    roscpp \
    rosparam-handler \
    rostest \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    eigen-conversions \
    filters \
    geometry-msgs \
    pluginlib \
    roscpp \
    rosparam-handler \
    rostest \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    eigen-conversions \
    filters \
    geometry-msgs \
    pluginlib \
    roscpp \
    rosparam-handler \
    rostest \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/KITrobotics/iirob_filters-release/archive/release/melodic/iirob_filters/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "56cf69bcea560a18a681d4470459f676"
SRC_URI[sha256sum] = "6629c570ce81b0181753951b2c3376bfe2c81ba9d8819f32380e8a5e668c3494"
S = "${WORKDIR}/iirob_filters-release-release-melodic-iirob_filters-0.8.1-2"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/iirob-filters/iirob-filters_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/iirob-filters/iirob-filters_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/iirob-filters/iirob-filters-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/iirob-filters/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/iirob-filters/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
