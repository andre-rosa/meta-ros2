# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "speech_recognition_msgs"
AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/speech_recognition_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "speech_recognition_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/speech_recognition_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f380a85d009a854aa6594bb00b202008"
SRC_URI[sha256sum] = "f6b39c252c011e5572aa0a1fed50b3ecdefa2abe7c96da0259fd1e578cac6541"
S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-speech_recognition_msgs-4.3.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jsk-common-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common-msgs/jsk-common-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common-msgs/jsk-common-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
