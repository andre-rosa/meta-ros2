# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch a PID control node."
AUTHOR = "Andy Zelenak <andyz@utexas.edu>"
HOMEPAGE = "http://wiki.ros.org/pid"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "pid"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    message-generation \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    message-runtime \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    message-runtime \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/AndyZe/pid-release/archive/release/melodic/pid/0.0.27-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c90dd4145fb8f75d0f3b2f979adb7906"
SRC_URI[sha256sum] = "6066703ba3197ee904f55d7e6b1fc054e1901b5ad4d826753061715945a57d62"
S = "${WORKDIR}/pid-release-release-melodic-pid-0.0.27-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pid/pid_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pid/pid_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pid/pid-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pid/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pid/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
