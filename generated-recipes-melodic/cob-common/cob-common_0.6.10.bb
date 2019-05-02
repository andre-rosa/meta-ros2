# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_common stack hosts common packages that are used within the Care-O-bot repository. E.g. utility packages or common message and service definitions etc. Also the urdf desciption of the robot is located in this stack."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/cob_common"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "cob_common"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-actions \
    cob-description \
    cob-msgs \
    cob-srvs \
    raw-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_common/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f8d461ec046efb72c8fce7bf96d582b"
SRC_URI[sha256sum] = "84d1c74ce5aab95a64c655926aef6a9b76df9d5acd2c683fa5319e3015ff4dd6"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_common-0.6.10-0"

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
