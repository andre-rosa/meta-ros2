# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This Package contains Care-O-bot specific service definitions."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/cob_srvs"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "cob_srvs"

ROS_BUILD_DEPENDS = " \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_srvs/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "52d03afdd9b3aa6914d510508cbdc93b"
SRC_URI[sha256sum] = "1088b5dbe8ab9875e5f02cc74208dfa61f3d7f208c83b3cfe4be94c909c7e880"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_srvs-0.6.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/cob-common/cob-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/cob-common/cob-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/cob-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
