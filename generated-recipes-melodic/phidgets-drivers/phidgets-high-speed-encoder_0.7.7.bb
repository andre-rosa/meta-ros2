# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets high speed encoder devices"
AUTHOR = "Geoff Viola <geoffrey.viola@asirobots.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    libphidget21 \
    message-generation \
    phidgets-api \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libphidget21 \
    message-runtime \
    phidgets-api \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libphidget21 \
    message-runtime \
    phidgets-api \
    roscpp \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_high_speed_encoder/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "21b2b02a6f4185759c4c4d5eb87cc3b7"
SRC_URI[sha256sum] = "462219fb56f8ef2d8fbcf1b6237a6313fc1c5612f883cb0385ef3bfd5ae7f063"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_high_speed_encoder-0.7.7-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/phidgets-drivers/phidgets-drivers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/phidgets-drivers/phidgets-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/phidgets-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
