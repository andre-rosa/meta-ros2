# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on packages for interfacing common     joysticks and human input devices with ROS."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
HOMEPAGE = "http://www.ros.org/wiki/joystick_drivers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joy \
    ps3joy \
    spacenav-node \
    wiimote \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/joystick_drivers/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ebcadd334b515bc595fa29a251258e57"
SRC_URI[sha256sum] = "bfa46ae2ec0edaf6d3bb8d0876da64c78f295047cd7d60a40ace164bdcd6fdeb"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-joystick_drivers-1.12.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/joystick-drivers/joystick-drivers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/joystick-drivers/joystick-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/joystick-drivers/joystick-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/joystick-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/joystick-drivers/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
