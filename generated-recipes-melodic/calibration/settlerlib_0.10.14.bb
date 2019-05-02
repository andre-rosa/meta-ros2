# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Defines helper functions and routines that greatly help when trying to create a settler     for a specific sensor channel. This package is experimental and unstable.     Expect its APIs to change."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/settlerlib"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "settlerlib"

ROS_BUILD_DEPENDS = " \
    boost \
    calibration-msgs \
    rosconsole \
    rostime \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    calibration-msgs \
    rosconsole \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    calibration-msgs \
    rosconsole \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/settlerlib/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5943400d9ea07dd9d97ebd937d9241b5"
SRC_URI[sha256sum] = "795d9982aacaca98ad5750e40e707596f6a88b7f7f703ee664ebd98464d861b8"
S = "${WORKDIR}/calibration-release-release-melodic-settlerlib-0.10.14-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/calibration/calibration_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/calibration/calibration_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/calibration/calibration-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/calibration/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/calibration/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
