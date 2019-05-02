# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts between Python dictionaries and JSON to rospy messages."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
HOMEPAGE = "http://ros.org/wiki/rospy_message_converter"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rospy_message_converter"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    roslib \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    roslib \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
    std-srvs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uos-gbp/rospy_message_converter-release/archive/release/melodic/rospy_message_converter/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2c1d3b93889d33e204465e73185a9e71"
SRC_URI[sha256sum] = "c35584b4ef0c7fed1e90a35bfeb17ad63ec36a9a86ba1aaf74547cdcbd1cea37"
S = "${WORKDIR}/rospy_message_converter-release-release-melodic-rospy_message_converter-0.5.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rospy-message-converter/rospy-message-converter_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rospy-message-converter/rospy-message-converter_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rospy-message-converter/rospy-message-converter-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rospy-message-converter/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rospy-message-converter/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
