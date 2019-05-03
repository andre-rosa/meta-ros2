# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS tools for those who live in Emacs."
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
HOMEPAGE = "http://www.ros.org/wiki/rosemacs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rosemacs"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    readline \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    readline \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/rosemacs/0.4.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c7f9386edd204ce08c8987eabc5c2af0"
SRC_URI[sha256sum] = "80a2911c8cf86b70a771060e8304d9234b375b2f221fb42e63bfe5bfbf8f36a1"
S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-rosemacs-0.4.13-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros-emacs-utils', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-emacs-utils/ros-emacs-utils_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-emacs-utils/ros-emacs-utils-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-emacs-utils/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-emacs-utils/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
