# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The driver_common stack contains classes and tools that are useful     throughout the driver stacks. It currently contains:      driver_base: A base class for sensors to provide a consistent state machine     (retries, error handling, etc.) and interface      timestamp_tools: Classes to help timestamp hardware events"
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/driver_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "driver_common"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    driver-base \
    timestamp-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    driver-base \
    timestamp-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/driver_common-release/archive/release/melodic/driver_common/1.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "491def89fa6f80a362d08eec8492b693"
SRC_URI[sha256sum] = "ea3516b1e1c6ad29343302b5c174ea896dc280f60800fe0c6d0e34e08b31d465"
S = "${WORKDIR}/driver_common-release-release-melodic-driver_common-1.6.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/driver-common/driver-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/driver-common/driver-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/driver-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
