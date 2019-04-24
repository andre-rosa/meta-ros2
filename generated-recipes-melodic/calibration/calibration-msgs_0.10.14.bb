# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for storing calibration samples      to be used in full robot calibration procedures. This package      is still unstable. Expect the messages to change."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/calibration_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
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

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration_msgs/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ebf30ee454ab235f202681f90231038c"
SRC_URI[sha256sum] = "f85ef3c769ab6d3c7dd2b91cd681c2364657302db08d2107b5d3eb1f29ac1bdf"
S = "${WORKDIR}/calibration-release-release-melodic-calibration_msgs-0.10.14-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/calibration/calibration_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/calibration/calibration_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/calibration/calibration-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/calibration/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/calibration/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
