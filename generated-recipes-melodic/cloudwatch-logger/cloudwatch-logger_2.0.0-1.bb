# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CloudWatch Logger node for publishing logs to AWS CloudWatch Logs"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/cloudwatch_logger"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-logs-common \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-logs-common \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-logs-common \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_logger-release/archive/release/melodic/cloudwatch_logger/2.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e7ec0046eae598aae84ee8b2c0ac189d"
SRC_URI[sha256sum] = "1807f520e5a757a72c0c46f40c1e114e7b743ad0ff5e9452579496be857ce3e3"
S = "${WORKDIR}/cloudwatch_logger-release-release-melodic-cloudwatch_logger-2.0.0-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/cloudwatch-logger/cloudwatch-logger_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/cloudwatch-logger/cloudwatch-logger_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cloudwatch-logger/cloudwatch-logger-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cloudwatch-logger/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cloudwatch-logger/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
