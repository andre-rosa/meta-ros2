# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides a script that launches Emacs with Slime (the     Superior Lisp Interaction Mode) ready for Lisp development and     roslisp."
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
ROS_AUTHOR = "Lorenz Moesenlechner"
HOMEPAGE = "https://github.com/code-iai/ros_emacs_utils"
SECTION = "devel"
LICENSE = "public_domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=90cf8e14bb501c1f6d3eda81e45e438a"

ROS_CN = "ros_emacs_utils"
ROS_BPN = "roslisp_repl"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosemacs \
    roslisp \
    sbcl \
    slime-ros \
    slime-wrapper \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosemacs \
    roslisp \
    sbcl \
    slime-ros \
    slime-wrapper \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/roslisp_repl/0.4.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fc5a134e92414f3dfadf80aed6d59d81"
SRC_URI[sha256sum] = "8a3c6a1532c2cda1967b880e2a26474c04966c606d4cf5ef5a1fcbe65f2ccc7f"
S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-roslisp_repl-0.4.13-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-emacs-utils', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-emacs-utils', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-emacs-utils/ros-emacs-utils_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-emacs-utils/ros-emacs-utils-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-emacs-utils/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-emacs-utils/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
