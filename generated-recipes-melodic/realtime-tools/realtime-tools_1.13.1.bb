# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains a set of tools that can be used from a hard     realtime thread, without breaking the realtime behavior.  The     tools currently only provides the realtime publisher, which makes     it possible to publish messages to a ROS topic from a realtime     thread. We plan to add a basic implementation of a realtime     buffer, to make it possible to get data from a (non-realtime)     topic callback into the realtime loop. Once the lockfree buffer is     created, the realtime publisher will start using it, which will     result in major API changes for the realtime publisher (removal of     all lock methods)."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/realtime_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "realtime_tools"

ROS_BUILD_DEPENDS = " \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/melodic/realtime_tools/1.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "81dc82a9e2f3045d8cd5d81fdafa3860"
SRC_URI[sha256sum] = "399aca3a72c59e2bd7bfc508e7dca8cb53d95ee76f067f4b11ecdaa49ea7e225"
S = "${WORKDIR}/realtime_tools-release-release-melodic-realtime_tools-1.13.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/realtime-tools/realtime-tools_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/realtime-tools/realtime-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/realtime-tools/realtime-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/realtime-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/realtime-tools/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
