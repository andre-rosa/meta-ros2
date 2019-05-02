# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Topic tools for treating messages as variant types."
AUTHOR = "Ralf Kaestner <ralf.kaestner@gmail.com>"
HOMEPAGE = "http://github.com/ethz-asl/ros-topic-variant"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=146ba316845cfe6058c8baebd902a726"

ROS_BPN = "variant_topic_tools"

ROS_BUILD_DEPENDS = " \
    roscpp \
    roslib \
    variant-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    roslib \
    variant-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    roslib \
    variant-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/variant-release/archive/release/melodic/variant_topic_tools/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f0b4e1d49d847cddf0b78ccbc7085f0a"
SRC_URI[sha256sum] = "1ae4620ffffc3b0a3aa6b54e148f6bf58f06ca520131aa72d07bc8c0732445eb"
S = "${WORKDIR}/variant-release-release-melodic-variant_topic_tools-0.1.5-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/variant/variant_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/variant/variant_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variant/variant-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variant/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variant/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
