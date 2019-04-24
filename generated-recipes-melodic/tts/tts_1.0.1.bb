# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Package enabling a robot to speak with a human voice by providing a Text-To-Speech ROS service"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/tts"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "tts"
ROS_BPN = "tts"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    message-generation \
    python-boto3 \
    rospy \
    rostest \
    rosunit \
    sound-play \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    rospy \
    sound-play \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
    python-boto3 \
    rospy \
    sound-play \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python-mock \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/tts-release/archive/release/melodic/tts/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "446c310c5d47518e735c604d311ed2ea"
SRC_URI[sha256sum] = "1d5dd8813c3e0cf4e9e75bd364a93f1b0b02072ddd561fa0d316a75cd0a9d708"
S = "${WORKDIR}/tts-release-release-melodic-tts-1.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('tts', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('tts', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tts/tts_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tts/tts-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tts/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tts/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
