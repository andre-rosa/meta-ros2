# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Messages for calibrating a robot"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/robot_calibration_msgs"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "robot_calibration"
ROS_BPN = "robot_calibration_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    geometry-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
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

SRC_URI = "https://github.com/ros-gbp/robot_calibration-release/archive/release/melodic/robot_calibration_msgs/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f0184460021b115d55df332c2694aa2e"
SRC_URI[sha256sum] = "ea0ffb952c39266c63a6a96dea7b3763b0c36c4b28363c08d41171ed1a021097"
S = "${WORKDIR}/robot_calibration-release-release-melodic-robot_calibration_msgs-0.6.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('robot-calibration', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('robot-calibration', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-calibration/robot-calibration_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-calibration/robot-calibration-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-calibration/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-calibration/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
