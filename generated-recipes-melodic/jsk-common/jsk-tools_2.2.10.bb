# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Includes emacs scripts, ros tool alias generator, and launch doc generator."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/jsk_tools"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "jsk_tools"

ROS_BUILD_DEPENDS = " \
    git \
    rosgraph-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    iproute2 \
    jsk-gui-msgs \
    jsk-network-tools \
    jsk-topic-tools \
    python-colorama \
    python-percol \
    python-progressbar \
    python-pygithub3 \
    python-requests \
    python-rosdep \
    python-slacker-cli \
    python-tabulate-pip \
    python-texttable \
    rosbag \
    rosemacs \
    rosgraph-msgs \
    rospy \
    rqt-reconfigure \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    iproute2 \
    jsk-gui-msgs \
    jsk-network-tools \
    jsk-topic-tools \
    python-colorama \
    python-percol \
    python-progressbar \
    python-pygithub3 \
    python-requests \
    python-rosdep \
    python-slacker-cli \
    python-tabulate-pip \
    python-texttable \
    rosbag \
    rosemacs \
    rosgraph-msgs \
    rospy \
    rqt-reconfigure \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_tools/2.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f0096a9a5f52a59a224a1e79e0eb39f"
SRC_URI[sha256sum] = "f320ae1c4775755b4236236bc4b43ea7b941cb2ecd775f2d5e0d004ec45db61c"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_tools-2.2.10-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jsk-common', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/jsk-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/jsk-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
