# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the description of the hand-eye calibration of the TALOS robot.  The files in this package are used also from the talos_description package."
AUTHOR = "Victor Lopez <victor.lopez@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c34cc4dbd73e2cebfa3f363105f53fd5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pal-gbp/talos_robot-release/archive/release/melodic/talos_description_calibration/1.0.45-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7a10c211724bbbcffd21e1373777e7d9"
SRC_URI[sha256sum] = "d5e6dc7ae7fcb932718a916c9be6c892b135ff83c5be3795c87cd4b9412f72e0"
S = "${WORKDIR}/talos_robot-release-release-melodic-talos_description_calibration-1.0.45-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/talos-robot/talos-robot_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/talos-robot/talos-robot_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/talos-robot/talos-robot-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/talos-robot/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/talos-robot/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
